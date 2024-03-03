package com.company;


import java.io.*;
import java.util.*;

public class CF_Solution{

    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }
        public void println() throws IOException{
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }
    static class BinaryLifting{
        ArrayList<ArrayList<Integer>> adj;
        int root,n;
        int up[][];
        int depth[];
        BinaryLifting(ArrayList<ArrayList<Integer>> adj,int root){
            this.adj=adj;
            this.root=root;
            n=adj.size();
            up=new int[n+2][log2(n+2)+2];
            depth=new int[n+3];
            for(int i[]:up) Arrays.fill(i,-1);
            initialization1(root,-1);
            initialization2();
        }
        private void initialization1(int node,int par){
            up[node][0]=par;
            if(par==-1) depth[node]=0;
            else depth[node]=depth[par]+1;
            for(int i:adj.get(node)){
                if(i==par) continue;
                initialization1(i,node);
            }
        }
        private void initialization2(){
            for(int i=1;i<=log2(n+2)+1;i++){
                for(int j=0;j<=n;j++){
                    if(up[j][i-1]==-1) up[j][i]=-1;
                    else up[j][i]=up[up[j][i-1]][i-1];
                }
            }
        }
        public int kthAncestor(int node,int k){
            if(k==0||node==-1) return node;
            return kthAncestor(up[node][log2(k)],k-(int)(Math.pow(2,log2(k))));
        }
        public int lca(int node1,int node2){
            if(depth[node1]<depth[node2]) return lca(node2,node1);
            while(depth[node1]-depth[node2]!=0){
                node1=up[node1][log2(depth[node1]-depth[node2])];
            }
            if(node1==node2) return node1;
            for(int i=log2(n)+1;i>=0;i--){
                if(up[node1][i]!=up[node2][i]){
                    node1=up[node1][i];
                    node2=up[node2][i];
                }
            }
            return up[node1][0];
        }
        public int distance(int node1,int node2){
            int root=lca(node1,node2);
            return depth[node1]+depth[node2]-2*depth[root];
        }
        private int log2(int n){
            return (int)(Math.log(n)/Math.log(2));
        }
    }
    static class SegmentTree{
        static int seg[]=new int[(int)1e6];
        public static int build(int lo,int hi,int arr[],int ind){
            if(lo==hi) {seg[ind]=arr[lo];return arr[lo];}
            int mid=(lo+hi)/2;
            return seg[ind]=build(lo,mid,arr,2*ind+1)+build(mid+1,hi,arr,2*ind+2);
        }
        public static int update(int lo,int hi,int arr[],int ind,int up){
            if(lo>up || hi<up) return seg[ind];
            if(lo==hi){
                seg[ind]=arr[lo];
                return seg[ind];
            }
            int mid=(lo+hi)/2;
            return seg[ind]=update(lo,mid,arr,2*ind+1,up)+update(mid+1,hi,arr,2*ind+2,up);
        }
        public static int query(int lo,int hi,int ind1,int ind2,int ind){
            if(hi<ind1||lo>ind2) return 0;
            if(lo>=ind1 && hi<=ind2) return seg[ind];
            int mid=(lo+hi)/2;
            return query(lo,mid,ind1,ind2,2*ind+1)+query(mid+1,hi,ind1,ind2,2*ind+2);
        }
    }
    static long gcd(long a, long b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        long k;
        for (k = 0; ((a | b) & 1) == 0; ++k) {
            a >>= 1;
            b >>= 1;
        }
        while ((a & 1) == 0)
            a >>= 1;
        do {
            while ((b & 1) == 0)
                b >>= 1;
            if (a > b) {
                long temp = a;
                a = b;
                b = temp;
            }

            b = (b - a);
        } while (b != 0);
        return a << k;
    }
    static long longSqrt(long n){
        long temp=(long)Math.sqrt(n);
        if(temp*temp>n) return temp-1;
        return temp;
    }
    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        int k;
        for (k = 0; ((a | b) & 1) == 0; ++k) {
            a >>= 1;
            b >>= 1;
        }
        while ((a & 1) == 0)
            a >>= 1;
        do {
            while ((b & 1) == 0)
                b >>= 1;
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }

            b = (b - a);
        } while (b != 0);
        return a << k;
    }
    static int[] sieveOfEratosthenes(int n){
        int arr[]=new int[n+1];
        for(int i=2;i<=n;i++){
            if(arr[i]!=0) continue;
            for(int j=i;j<=n;j+=i){
                if(arr[j]==0) arr[j]=i;
            }
        }
        return arr;
    }
    static int smallestPrimeFactor(int k){
        for(int i=2;i*i<=k;i++){
            if(k%i==0) return i;
        }
        return 1;
    }
    // modulo value is set 1e9+7
    static long power(long x,long n){
        long div=(long)1e9+7;
        //long div=(long)998244353;
        if(n==0) return 1L;
        if(n==1) return x;
        long temp=power(x,n/2)%div;
        long l = ((temp % div) * (temp % div)) % div;
        if(n%2==0) return l;
        return (l * x)%div;
    }
    public static long a_div_b(long p, long q) {
        // remember (a/b) mod m == (a%m/b%m) mod m
        long mod=1000000007;
        if(p==0) return 0;
        //long mod=(long)998244353;
        long ex = mod-2;
        while(ex != 0) {
            if((ex & 1) == 1) p = (p*q) % mod;
            q = (q*q) % mod;
            ex >>= 1;
        }
        return p;
    }
    static long factorial(long b){
        long temp=1;
        long div=(long)1e9+7;
        //long div=(long)998244353;
        for(long i=1;i<=b;i++){
            temp*=i;
            temp=temp%div;
        }
        return temp;
    }

    /**************************GLOBAL_VAR**************************************/

    /*************************************************************************/
    public static void main(String[] args) {
        try {
            //Scanner in=new Scanner(System.in);
            FastReader sc = new FastReader();
            FastWriter out = new FastWriter();
            /*************************************************************************/
            long div=(int)1e9+7;
            //long div=(long)998244353;

            int T=sc.nextInt();
            //int T=1;
            while(T-->0)
            {
                int x = 123456;
                float y = 100.12f;
                System.out.println("Float value"+y);

//
            }
            /*************************************************************************/
            out.close();
        }
        catch (IOException e){
            return;
        }
    }
    /***********************************FUNCTIONS*********************************/


    /*****************************************************************************/

    static class Pair
    {
        int node;
        int wt;
        Pair(int node,int wt)
        {
            this.node=node;
            this.wt=wt;
        }
    }
}


