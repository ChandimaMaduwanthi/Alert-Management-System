import React, { Component } from 'react'

import axios from 'axios';

var mainData = require('../MainData.json')

export default class AlertVal extends Component {

    constructor(props) {
        super(props)
    
        this.state = {
             val:""
        }
    }

    
  componentDidMount(){
    axios.get(mainData.one).then(
        response => {
            console.log("one"+JSON.stringify(response.data))
            this.setState({val:response.data.data_value})
           
        }
    )
    .catch(error => {
        console.log(error)
    })
    
}

componentDidUpdate(){
    this.componentDidMount();
}
    
    render() {
        return (
            <div>
                <h1 style={{fontSize:"60px"}}>{this.state.val}F</h1>
            </div>
        )
    }
}
