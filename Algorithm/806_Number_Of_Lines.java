class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int[] ans = new int[2]; 
        if(widths.length== 0||widths == null) return ans;
        char[] chararr = S.toCharArray();
        int sum = 0;
        int lines = 1;
        for(char c:chararr){
            sum += widths[c-'a'];
            if(sum > 100){           //如果sum在此时大于100，则最后一个字符的值肯定横跨了边界
                lines++;            //所以起始sum值为上一行最后一个字符，这里有个不好的点，例子
                sum = widths[c-'a'];  //没说是不是每行都要填满 或者是不填满
            }
        }
        ans[0] = lines; 
        ans[1] = sum;
        
       
        
        
        
        return ans;
    }
}