import {React, useState} from 'react'

import {axios} from 'axios'

const Submit = () => {
    const [value, setValue] = useState();
    const submit1 = () => {
        console.log("Why have I forgotten everything?")
        if(value > 0 && value < 11){
        console.log(value)
        }

    }
    return (
        <div>
            
                <input type = "Text" value = {value} placeholder = "Enter a number 1-10"/>
                <button onClick={submit1()}> submit </button>
        
        </div>
    )
}

export default Submit
