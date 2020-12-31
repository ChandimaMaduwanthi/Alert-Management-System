import Chart from 'react-apexcharts'
import React, { Component } from 'react'
import axios from 'axios';

var mainData = require('../MainData.json')
class ChartShow extends Component {
  constructor(props) {
    super(props);
 
    this.state = {
      options:{},
      series: [{
        name: 'F',
        data: []
      }]
    }
  }

  componentDidMount(){
    axios.get(mainData.readings).then(
        response => {
            console.log("rea"+JSON.stringify(response.data))

            let xData = [];
            let yData = [];
            let x = 0;
            response.data.map(
              z=>(
                yData[x] = z['data_value'],
                xData[x++] = z['date']
              )
            )


            this.setState({series:[{
              name: 'F',
              data: yData
            }]});
            
            this.setState({options:{
              chart: {
                id: 'apexchart-example'
              },
              xaxis: {
                categories:xData
              }
            }})
           
        }
    )
    .catch(error => {
        console.log(error)
    })
    
}

// componentDidUpdate(){
//     this.componentDidMount();
// }

  
  render() {
    return (
      <>
        
            <Chart   options={this.state.options} series={this.state.series} type="line" height={400} />
          

      </>
      
    )
  }
};

export default ChartShow;