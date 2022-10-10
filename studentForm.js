const data = document.querySelector("#form");
let amountOfAges = 0;
let countOfStudents = 0;
var now = new Date();

var day = ("0" + now.getDate()).slice(-2);
var month = ("0" + (now.getMonth() + 1)).slice(-2);

var today = now.getFullYear()+"-"+(month)+"-"+(day) ;
const ageForm = document.querySelector('[name="age"]');
ageForm.setAttribute("max", today)

data.addEventListener("submit", (e) => {
  e.preventDefault();
   const name = document.querySelector('[name="name"]');
    const  age = document.querySelector('[name="age"]');
    const  gender = document.querySelector('[name="gender"]');
    const ageNum = new Date(age.value)
    const tbody = document.querySelector('#tbody')
    tbody.innerHTML= tbody.innerHTML + `
                   <tr>
                     <td>${name.value}</td>
                     <td>${gender.value = "male"? 'мужской': 'женский'}</td>
                     <td>${age.value}</td>
                     <td>${now.getFullYear() - ageNum.getFullYear()}</td>
                   </tr>`

    amountOfAges = amountOfAges + (now.getFullYear() - ageNum.getFullYear())
    countOfStudents+= 1

    const  middleAge = document.querySelector('#middleAge');
    middleAge.innerHTML = amountOfAges / countOfStudents
  }
)
