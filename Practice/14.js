// let data = "sjsagj asha jash hgds dhshjds dsjnd ";

// // method 1
// let length = 0;
// let plength = 0;

// for (let i = 0; i < data.length; i++) {
//     if (data[i] == " ") {
//         plength = length;
//         length = 0;
//     }else{
//       length++  
//     }
// }
// console.log("Length of last string is :", length == 0 ? plength:length);

// // method 2
// let b = data.trim().split(" ")
// let l = b[b.length-1].length
// console.log("Length of last string is :", l);

// 2.
// Problem: Given an array of integers nums and an integer target, return the indices of the two numbers that add up to target.
// let nums = [2, 8, 11, 15, 7, 3, 6]
// let target = 9

// for (let i = 0; i < nums.length; i++) {
//     for (let j = i + 1; j < nums.length; j++) {
//         if (nums[i] + nums[j] == target) {
//             console.log(i, j)
//         }
//     }
// }