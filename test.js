




// “Malayalam“
// "Mr. Owl ate my metal worm"
// "Do geese see God?"
// "Was it a car or a cat I saw?"
// "Rats live on no evil star"
// "Live on time, emit no evil"
// "Step on no pets"
// function ispalindrome(str) {
//   let compactStr = str.replace(/ /g,'').replace(/[`~!@#$%^&*()_|+\-=?;:'",.<>\{\}\[\]\\\/]/gi, '')

//   // console.log(compactStr)

//   let newStr= compactStr.split("").reverse().join("")
//   // console.log(newStr)
//   if(compactStr.toLowerCase() === newStr.toLowerCase()) return true
//   else return false 
// }

// console.log(ispalindrome("Do geese see God?"))

// let str1 = "Tom Marvolo Riddle"
// let str2 = "I am Lord Voldemort"
// // debit card→bad credit

// // Debit card → Bad credit

// function  isAnagram( str1 , str2) {
//   let obj1 ={}
//   let obj2 ={}

//   let array1 = str1.replace(/ /g,'').replace("").toLowerCase();
//   let array2 = str2.replace(/ /g,'').replace("").toLowerCase();

//   for(let each of array1){
//     if(obj1[each]){
//       obj1[each]+=1
//     }else {
//       obj1[each]=1
//     }
//   }

//   for(let each of array2){
//     if(obj2[each]){
//       obj2[each]+=1
//     }else {
//       obj2[each] = 1
//     }
//   }
//   console.log(obj1)
//   console.log(obj2)

//   for(let each in obj1 ){
//     if(obj2[each]){
//       if (obj1[each]!==obj1[each]) return false 
//     }
//   }

//   return true
  
  

// }

// console.log(isAnagram(str1 , str2)
// )

// let a= [2398,34,7876,3413,5435,456,5462,9284,2998]

// let b= a.sort((a ,b) => a-b)
// console.log(b)

// Create a function called multiply that takes an integer n as input and returns a Promise with the output as n*2 after waiting for n seconds 

// function multiply(n) {

//   return new Promise ((res , rej) => {
//     setTimeout(()=>{
//       res(n*2)
//     } , n*1000)
//   })

// }

// multiply(2).then((res)=>{
//   console.log(res)
// })

// Promise.resolve(1)
// .then((r) => {
//   console.log(r);
//   return r*10;
// })
// .then((r) => {
//   console.log(r);
//   return r*10;
// })
// .then((r) => {
//   let pr = new Promise((res)=>{
//     setTimeout(()=>{
//       console.log(r); 
//       res(r)
//     } , 1000)
//   })
//   return r*10;
// })
// .then((r) => {
//   console.log(r);
//   return r*10;
// })
// .catch((err) => {
//   console.log(err);
// });


// Implement the following delay function that takes in 2 arguments, the first argument is a function called fn and the second argument t is time in milliseconds. The delay function should execute the function fn AFTER t time has elapsed. After the fn function has completed its execution, the result from the fn function should be logged in the thennable block. The function fn CAN be an async function as well 

const delay =(fn, t) => {
    return new Promise((res , rej) => {
      setTimeout(() => {
        res(fn())
      } , t)
    })
  }
  
  function fn (){
    return "hello";
  }
  
  delay(fn, 2000).then((res) => console.log(res));