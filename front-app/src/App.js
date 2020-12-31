import Chart from 'react-apexcharts'
import React, { Component } from 'react'
import ChartShow from './components/ChartShow';
class App extends Component {
  constructor(props) {
    super(props);
 
    this.state = {
      
    }
  }
  render() {
    return (
      <>
        <div className="mainContainer">
          <div className="titleContainer">
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

                  <select name="cars" id="cars">
                    <option value="volvo">Volvo</option>
                    <option value="saab">Saab</option>
                    <option value="mercedes">Mercedes</option>
                    <option value="audi">Audi</option>
                  </select>
                
              </div>
              
              
          </div>
          <div className="chartContainer">
              <ChartShow/>
          </div>
        </div>

      </>
      
    )
  }
};

export default App;