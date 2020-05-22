/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasnolineales;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 *
 * @author samaniw
 */
public class EstructurasNoLineales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //prueba de Dijkstra
        DGrahp superTest = new DGrahp();
        superTest.addNode("A");
        superTest.addNode("B");
        superTest.addNode("C");
        superTest.addNode("D");
        superTest.addEdge("A", "B", 2);
        superTest.addEdge("A", "C", 5);
        superTest.addEdge("B", "A", 2);
        superTest.addEdge("B", "C", 2);
        superTest.addEdge("B", "D", 5);
        superTest.addEdge("C", "A", 5);
        superTest.addEdge("C", "B", 2);
        superTest.addEdge("C", "D", 1);
        superTest.addEdge("D", "B", 5);
        superTest.addEdge("D", "C", 1);
        System.out.println("lista de adyacencias");
        superTest.showAList();
        System.out.println("Mapa de recorrido");
        HashMap<String, Node> map = superTest.Dijkstra("A");
        for (String node : map.keySet()) {
            System.out.println(node + map.get(node).getWeight()+map.get(node).getNode());
        }
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node("A", 9));
        pq.add(new Node("B", 3));
        pq.add(new Node("C", 5));
        System.out.println("Sacado de la cola:" + pq.poll().getNode());

        BinarySearchTree test = new BinarySearchTree(10);
        //datos de prueba que se pueden usar en https://visualgo.net/en/bst
        //10,5,3,8,20,7,18,25,23,30,21,24        
        test.Add(5);
        test.Add(3);
        test.Add(8);
        test.Add(20);
        test.Add(7);
        test.Add(18);
        test.Add(25);
        test.Add(23);
        test.Add(30);
        test.Add(21);
        test.Add(24);
        test.Delete(5);
        test.Delete(3);
        test.Delete(20);
        test.Delete(25);
        test.Delete(30);
        test.Delete(8);
        //llamar al método
        test.LevelOrder();

        System.out.println("");

        //System.out.println(pino.Search(88));
        // TODO code application logic here
        DGrahp g0 = new DGrahp();
        g0.addNode("A");
        g0.addNode("D");
        g0.addNode("B");
        g0.addNode("C");
        g0.addNode("E");
        g0.addEdge("A", "B", 1);
        g0.addEdge("A", "C", 1);
        g0.addEdge("A", "E", 3);
        g0.addEdge("C", "E", 1);

        g0.showAList();
        Graph g1 = new Graph(7);
        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(1, 3);
        g1.addEdge(2, 3);
        g1.addEdge(2, 4);
        g1.addEdge(2, 5);
        g1.addEdge(3, 6);
        g1.addEdge(4, 6);
        g1.addEdge(4, 5);

        //...
//        g1.deleteEdge(0, 1);
//        g1.deleteEdge(1, 2);
        System.out.println("Matriz de adyacencias");
        System.out.println(g1.showAMatrix());
        System.out.println("Lista de adyacencias");
        System.out.println(g1.showAList());

        System.out.println("Recorrido en profundidad");
        g1.DFS(0);
        System.out.println("");
        System.out.println("Recorrido en anchura");
        g1.BFS(0);
        System.out.println("");
        MaxHeap maxData = new MaxHeap();
        //31,51,53,28,47,22
        maxData.insert(31);
        maxData.insert(51);
        maxData.insert(53);
        maxData.insert(28);
        maxData.insert(47);
        maxData.insert(22);
        System.out.println(maxData.getDataHeap());
        maxData.ExtractMax();
        System.out.println(maxData.getDataHeap());
        System.out.println("");
        
        ///TALLER GRAFOS
        System.out.println("----------TALLER GRAFOS---------");
        Graph NodosG = new Graph(4);// Grafo para validar punto 1 y 2
        NodosG.addEdge(0, 1);
        NodosG.addEdge(0, 2);
        NodosG.addEdge(0, 3);
        NodosG.addEdge(1, 0);
        NodosG.addEdge(2, 0);
        NodosG.addEdge(3, 0);

        Graph NodosArco = new Graph(4);// Grafo para validar punto 3
        NodosArco.addEdge(0, 1);
        NodosArco.addEdge(1, 2);
        NodosArco.addEdge(2, 0);
        
        System.out.println("");
        System.out.print("Lista de adyacencia => ");//PUNTO 1
        NodosG.Profundidad(0);

        System.out.println("\n" + "Tiene el mismo numero de entradas y salidas => " + NodosG.EntradasySalidas()); //PUNTO 2

        System.out.print("Arcos faltantes => "); // PUNTO 3
        NodosArco.arcos();
    }

}
