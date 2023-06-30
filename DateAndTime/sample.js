const s = "ELEPHANT".split("");
const res = []
// s.forEach(ele => {
//   if(ele == ele.toUpperCase()){
//     res.push(ele.toLowerCase());
//   }
//   else if(ele == ele.toLowerCase()){
//     res.push(ele.toUpperCase());
//   }
// })

let result = ""
s.forEach(ele => ele == ele.toUpperCase()? result+=ele.toLowerCase():result+=ele.toUpperCase());
console.log(result);

