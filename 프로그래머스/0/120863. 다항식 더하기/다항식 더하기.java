class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] terms = polynomial.split(" ");
        int a = 0;
        int b = 0;
        
        for (String term : terms){
            if (term.contains("x")){
                String c = term.replace("x","");
                if ( c == ""){
                    c = "1";
                }
                a += Integer.parseInt(c);
            }else if (term.contains("+")){
                continue;
            }else {
                b += Integer.parseInt(term);
            }
        }
        
        if (a > 0 ){
            if ( a != 1){
                answer = a + "x";
            }else{
                answer = "x";
            }
             
            if (b > 0) {
                answer += " + " + b;
            }
        }else if (b > 0) {
            answer = String.valueOf(b);
        }
        return answer;
    }
}