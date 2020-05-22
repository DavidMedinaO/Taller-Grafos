/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasnolineales;

import java.util.LinkedList;

/**
 *
 * @author samaniw
 */
public class Graph {

    private boolean aMatrix[][];
    private int totalNodes;
    private LinkedList<Integer> aList[];

    public Graph(int n) {
        totalNodes = n;
        aMatrix = new boolean[n][n];
        aList = new LinkedList[n];
        for (int i = 0; i < totalNodes; i++) {
            aList[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int source, int destination) {
        aMatrix[source][destination] = true;
        aList[source].add(destination);
    }

    public void deleteEdge(int source, int destination) {
        aMatrix[source][destination] = false;
        aList[source].remove((Object) destination);
    }

    public String showAMatrix() {
        String Table = "";

        for (int i = 0; i < totalNodes; i++) {
            for (int j = 0; j < totalNodes; j++) {
                Table += aMatrix[i][j] ? 1 : 0;
            }
            Table += "\n";
        }

        return Table;
    }

    public String showAList() {
        String List = "";
        for (int i = 0; i < totalNodes; i++) {
            List += i + ": ";
            for (Integer v : aList[i]) {
                List += v + " ";
            }
            List += "\n";
        }
        return List;
    }

    public void DFS(int source) {
        boolean visited[] = new boolean[totalNodes];
        DFS(source, visited);
    }

    private void DFS(int source, boolean visited[]) {
        visited[source] = true;
        System.out.print(source + " ");
        for (int v : aList[source]) {
            if (!visited[v]) {
                DFS(v, visited);
            }
        }
    }

    public void BFS(int source) {
        boolean visited[] = new boolean[totalNodes];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[source] = true;
        queue.add(source);

        while (!queue.isEmpty()) {
            source = queue.poll();
            System.out.print(source + " ");
            for (int v : aList[source]) {
                if (!visited[v]) {
                     visited[v] = true;
                     queue.add(v);
                }
            }
        }
    }
    
    public void Profundidad(int posicion){
    boolean Visitado[] = new boolean[totalNodes];
    Profundidad(posicion, Visitado);
   }
   
   private void Profundidad(int posicion, boolean Visitado[]){
       Visitado[posicion] = true;      
       for(int v : aList[posicion]){
           System.out.print(posicion + " ");
           if (!Visitado[v]) {
               Profundidad(v, Visitado);
           }
       }
   }
   
   
    public boolean EntradasySalidas() {

        boolean funciona = true;
        for (int i = 0; i < totalNodes; i++) {
            int cont = 0;
            for (int j = 0; j < totalNodes; j++) {
                if (aMatrix[i][j]) {
                    cont++;

                }
            }

            if (cont != EntradasySalidas2(i)) {

                funciona = false;

            }
            if (!funciona) {
                break;
            }

        }
        return funciona;

    }
   
    private int EntradasySalidas2(int k) {

        int cont = 0;
        for (int i = 0; i < totalNodes; i++) {

            if (aMatrix[i][k]) {
                cont++;

            }

        }

        return cont;

    }
    
    
    
    public void arcos() {
        System.out.print("[");
        for (int i = 0; i < totalNodes; i++) {
            for (int j = 0; j < totalNodes; j++) {
                if (!aMatrix[i][j] && i > j && i != j && !aMatrix[j][i]) {

                    System.out.print("[" + j + "," + i + "]" + ",");
                }
            }
        }
        System.out.println("]");

    }

}
