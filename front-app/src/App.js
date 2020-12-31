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
          categories: [1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998]
        }
      },
      series: [{
        name: 'F',
        data: [30, 40, 45, 50, 49, 60, 70, 91]
      }]
    }
  }
  render() {
    return (
      <>
        <div className="mainContainer">
          <div className="titleContainer">
              <h1>Outdoor Temperature</h1>
          </div>
          <div className="chartContainer">
            <Chart options={this.state.options} series={this.state.series} type="line" height={500} />
          </div>
        </div>

      </>
      
    )
  }
};

export default App;