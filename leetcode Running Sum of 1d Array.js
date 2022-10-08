/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {
   var ans=[];
    nums.forEach((n,i)=>{
        
      ans.push(findSum(nums,i));  
    });
    return ans;
};
var findSum=function(n,i){
    var sum=0;
    let id=0;
    for(id=0;id<i+1;id++){
        sum+=n[id];
    }
    console.log(sum);
        return sum;
}
