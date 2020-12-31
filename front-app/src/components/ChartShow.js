import Chart from 'react-apexcharts'
import React, { Component } from 'react'
class ChartShow extends Component {
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
        
            <Chart   options={this.state.options} series={this.state.series} type="line" height={400} />
          

      </>
      
    )
  }
};

export default ChartShow;