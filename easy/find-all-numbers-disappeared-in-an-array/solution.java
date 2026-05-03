class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();

        for(int n : nums){
            if(m.containsKey(n)){
                m.put(n, m.get(n)+1);
            }else{
                m.put(n,1);
            }
        }

        //Now check which numbers are missing

        List<Integer> result = new ArrayList<>();

        for(int i = 1; i<=nums.length; i++){
            if(!m.containsKey(i)){
                result.add(i);
            }
        }
        return result;
        }

        
    }
    