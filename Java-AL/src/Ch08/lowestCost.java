package Ch08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class lowestCost {
    static int N,M;
    static ArrayList<Node>[] list;
    static int[] dist;
    static boolean[] visit;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        list = new ArrayList[N + 1];
        dist = new int[N + 1];
        visit = new boolean[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        for(int i =0; i <= N; i++){
            list[i] = new ArrayList<Node>();
        }

        for(int i =0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            list[start].add(new Node(end, weight));
        }
        st = new StringTokenizer(br.readLine());
        int startIndex = Integer.parseInt(st.nextToken());
        int endIndex = Integer.parseInt(st.nextToken());
        bw.write(dijkstra(startIndex, endIndex) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static int dijkstra(int start, int end){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));
        dist[start] = 0;
        while(!pq.isEmpty()){
            Node nowNode = pq.poll();
            int now = nowNode.targetNode;
            if(!visit[now]){
                visit[now] = true;
                for(Node n : list[now]){
                    if(!visit[n.targetNode] && dist[n.targetNode] > dist[now] + n.value){
                        dist[n.targetNode] = dist[now] + n.value;
                        pq.add(new Node(n.targetNode, dist[n.targetNode]));
                    }
                }
            }
        }
        return dist[end];
    }
}
class Node implements Comparable<Node>{
    int targetNode;
    int value;
    Node(int targetNode, int value){
        this.targetNode = targetNode;
        this.value = value;
    }
    @Override
    public int compareTo(Node o){
        return value - o.value;
    }
}
