ArrayList<Character> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < s.length(); i++){
            if(!list.contains(s.charAt(i)))list.add(s.charAt(i));
            else{
                int count = list.size();
                if(count > max) max = count;
                list.remove(0);
                i = i - 1;
            }
        }
       if(list.size() > max) max = list.size();
       return max;
