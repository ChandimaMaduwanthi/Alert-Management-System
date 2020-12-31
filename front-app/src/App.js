import Chart from 'react-apexcharts'
import React, { Component } from 'react'
import ChartShow from './components/ChartShow';
class App extends Component {
  constructor(props) {
    super(props);
 
    this.state = {
      value:"2"
    }

    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event) {
    this.setState({value: event.target.value});
  }

  handleSubmit(event) {
    alert('A name was submitted: ' + this.state.value);
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
                <h3>16 secounds ago</h3>
              </div>
              <div style={{float:'left',padding:"20px"}}>
                
                <h1 style={{fontSize:"60px"}}>50F</h1>
              </div>

              <div style={{float:'left',padding:"20px"}}>
                  <label for="cars">Choose a Sensor:</label>
                  <form onSubmit={this.handleSubmit} style={{zIndex:"100"}}>
                  <label>
                  Name:
                  <input type="text" value={this.state.value} onChange={this.handleChange} />
                </label>
                <input type="submit" value="Submit" />
              </form>
                  
                
              </div>
              
              
          </div>
          <div className="chartContainer" >
              <ChartShow/>
          </div>
        </div>

      </>
      
    )
  }
};

export default App;