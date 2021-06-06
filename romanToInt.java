class Solution {
    public int romanToInt(String s) {
        int[] val=new int[]{1,5,10,50,100,500,1000,4,9,40,90,400,900};
        String[] syms=new String[]{"I","V","X","L","C","D","M","IV","IX","XL","XC","CD","CM"};
        Map<String,Integer> map = new HashMap<>();
        for (int i=0;i<syms.length;i++) {
            map.put(syms[i],val[i]);
        }
        int ans=0;
        if (s.length()==1) return map.get(s);
        for (int i=0;i<s.length()-1;i++) {
            if (map.containsKey(s.substring(i,i+2))) {
                ans+=map.get(s.substring(i,i+2));
                i++;
            } else {
                ans+=map.get(s.substring(i,i+1));
                System.out.println(ans);
            }
            if (i==s.length()-2) ans+=map.get(s.substring(i+1));
        }
        return ans;
    }
}
