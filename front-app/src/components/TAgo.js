import React, { Component } from 'react'


import axios from 'axios';

var mainData = require('../MainData.json')

export default class TAgo extends Component {

    constructor(props) {
        super(props)
    
        this.state = {
             tAgo:""
        }
    }
    

    componentDidMount(){
        axios.get(mainData.one).then(
            response => {
                console.log("one"+JSON.stringify(response.data))

                var d = new Date();
                var n = d.getTime();

                var pasedDate = new Date(response.data.date);


                var dif = ( d-pasedDate ) / 1000/60;

                dif = Math.round(dif)
                // this.setState({tAgo:response.data.date})
                this.setState({tAgo:dif+"m ago"})
               
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
                <h3>{this.state.tAgo}</h3>
            </div>
        )
    }
}
