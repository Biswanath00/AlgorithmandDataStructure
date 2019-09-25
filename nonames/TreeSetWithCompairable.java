import java.util.*;

class Solution{
    static class Node implements Comparable<Node>{
        int data,freq;
        Node(int data,int freq){
            this.data=data;
            this.freq=freq;
        }
        public int compareTo(Node obj){
              if(this.freq==obj.freq)
               { //System.out.println(this.data-obj.data+"*"+this.data+"*"+obj.data);
                return this.data-obj.data;
               }
               // System.out.println(obj.freq-this.freq+"-"+this.freq+"-"+obj.freq);
            return obj.freq - this.freq;
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        StringBuffer out=new StringBuffer();
        int t=in.nextInt();
        
        while(t--!=0){
            int n=in.nextInt(),
                k=in.nextInt();
            
            TreeSet<Node> set=new TreeSet<Node>();
            HashMap<Integer,Node> map=new HashMap<>();
            
            for(int i=0;i<n;i++){
                
                int item=in.nextInt();
                if(map.containsKey(item)){
                    Node temp=map.get(item);
                    set.remove(temp);
                    temp.freq+=1;
                    set.add(temp);
                }
                else{
                    Node node=new Node(item,1);
                    map.put(item,node);
                    set.add(node);
                }
                
                int print=0;
                for(Node node:set){
                    out.append(node.data+" ");
                    print+=1;
                    if(print==k)
                        break;
                }
            }
            out.append("\n");
        }
        System.out.print(out);
    }
}
/*

2
5 4
5 2 1 3 2
5 4
5 2 1 3 4
*/