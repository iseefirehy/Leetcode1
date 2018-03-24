
//判断一个String是不是另外一个rotate结果，可以拼接一个String两次，看是否包含一个完整的目标String
class Solution {
    public boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A+A).contains(B);
    }
}