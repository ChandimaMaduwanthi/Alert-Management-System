import Chart from 'react-apexcharts'
import React, { Component } from 'react'
class App extends Component {
  constructor(props) {
    super(props);
 
    this.state = {
      options: {
        chart: {
          id: 'apexchart-example'
        },
        xaxis: {
          categories: ['2018-12-01 10:20:12', "2018-12-01 10:30:10", "2018-12-01 10:40:12", "2018-12-01 10:40:12", "2018-12-01 10:40:12", "2018-12-01 10:40:12", "2018-12-01 10:40:12", "2018-12-01 10:40:12",'2018-12-01 10:20:12', "2018-12-01 10:30:10", "2018-12-01 10:40:12", "2018-12-01 10:40:12", "2018-12-01 10:40:12", "2018-12-01 10:40:12", "2018-12-01 10:40:12", "2018-12-01 10:40:12",'2018-12-01 10:20:12', "2018-12-01 10:30:10", "2018-12-01 10:40:12", "2018-12-01 10:40:12", "2018-12-01 10:40:12", "2018-12-01 10:40:12", "2018-12-01 10:40:12", "2018-12-01 10:40:12",'2018-12-01 10:20:12', "2018-12-01 10:30:10", "2018-12-01 10:40:12", "2018-12-01 10:40:12", "2018-12-01 10:40:12", "2018-12-01 10:40:12", "2018-12-01 10:40:12", "2018-12-01 10:40:12"]
        }
      },
      series: [{
        name: 'F',
        data: [30, 40, 45, 50, 49, 60, 70, 91,30, 40, 45, 50, 49, 60, 70, 91,30, 40, 45, 50, 49, 60, 70, 91,30, 40, 45, 50, 49, 60, 70, 91]
      }]
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
            <Chart options={this.state.options} series={this.state.series} type="line" height={400} />
          </div>
        </div>

      </>
      
    )
  }
};

export default App;