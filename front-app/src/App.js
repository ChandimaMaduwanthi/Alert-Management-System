import Chart from 'react-apexcharts'
import React, { Component } from 'react'
import ChartShow from './components/ChartShow';
import TAgo from './components/TAgo';
import AlertVal from './components/AlertVal';
import axios from 'axios';
var mainData = require('./MainData.json')
class App extends Component {
  constructor(props) {
    super(props);
 
    this.state = {
      value:"2",
      senosrChart:<ChartShow sensor="4"/>,
      sensorNames:null,
      sensorIds:null
    }

    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  componentDidMount(){
    axios.get(mainData.sensorData).then(
        response => {
            console.log("res"+JSON.stringify(response.data.sensorNames))
            this.setState({sensorNames:response.data.sensorNames})
            this.setState({sensorIds:response.data.IDS})
           
        }
    )
    .catch(error => {
        console.log(error)
    })
    
}

componentDidUpdate(){
    this.componentDidMount();
}

  handleChange(event) {
    this.setState({value: event.target.value});
    this.setState({senosrChart:<ChartShow sensor="4"/>})
  }

  handleSubmit(event) {
    event.preventDefault();
  }
  render() {
    const {  value } = this.state;
    return (
      <>
        <div className="mainContainer">
          <div className="titleContainer" style={{height:"200px"}}>
              <div style={{float:'left',padding:"60px"}}>
                  <i class="fas fa-temperature-low" style={{fontSize:"60px"}}></i>  
              </div>
              <div style={{float:'left',padding:"20px"}}>
                <h1>Outdoor Temperature</h1>
                  <TAgo sensor="4"/>
                <h3>Sensor {this.state.value}</h3>
              </div>
              <div style={{float:'left',padding:"20px"}}>
                <AlertVal sensor="4"/>
                
              </div>

              <div style={{float:'left',padding:"20px"}}>
                  <label for="cars">Choose a Sensor:</label>
                  <form onSubmit={this.handleSubmit} style={{zIndex:"100"}}>
                  {/* <label>
                  Name:
                  <input type="text" value={this.state.value} onChange={this.handleChange} />
                </label> */}

                {/* <input type="submit" value="Submit" /> */}
                <select onChange={this.handleChange} value={this.state.value}>
                  {
                    this.state.sensorNames.map(
                      x=>{
                        <option>xx</option>
                      }
                    )
                  }
                </select>
              </form>
                  
                
              </div>
              
              
          </div>
          <div className="chartContainer" >
              {this.state.senosrChart}
              
          </div>
        </div>

      </>
      
    )
  }
};

export default App;