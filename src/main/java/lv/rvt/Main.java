package lv.rvt;


public class Main {
    public static void main(String[] args) {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("juice", 1000.0, 1000.0);
		juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);


		juice.printAnalysis();
    }
    }
    

