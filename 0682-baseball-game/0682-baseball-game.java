class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer>scores = new ArrayList<>();

        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("C")){
                scores.remove(scores.size() - 1);
            } else if(operations[i].equals("D")){
                scores.add(2*scores.get(scores.size() - 1));
            } else if(operations[i].equals("+")){
                int sum = scores.get(scores.size()-1) + scores.get(scores.size()-2);
                scores.add(sum);
            } else {
                scores.add(Integer.parseInt(operations[i]));
            }
        }

        int total = 0;
        for(int i = 0; i < scores.size(); i++){
            total += scores.get(i);
        }

        return total;
    }
}