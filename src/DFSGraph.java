import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class DFSGraph {
    int V;
    List<Integer>[] aList;
    public DFSGraph (int v){
        this.V = v;
        aList = new List[V];
        for(int i = 0 ;i<aList.length;i++){
            aList [i] = new LinkedList<>();
        }

    }
    public void addEdge(int src , int dest){
        aList[src].add(dest);
        aList[dest].add(src);
    }
    public void DFS(int start ){
        boolean visited[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.add(start);
        visited[start] = true;
        System.out.print(start+"->");
        while (!stack.isEmpty()){
            if(visited[start]){
                int x = stack.pop();

            }


            ListIterator<Integer> list = aList[start].listIterator();

            while (list.hasNext()){
                int x = list.next();
                if (!visited[x]){
                    stack.add(x);
                    System.out.print(x+"->");
                    visited[x] = true;
                    start=x;
                }

            }

        }




    }

}
