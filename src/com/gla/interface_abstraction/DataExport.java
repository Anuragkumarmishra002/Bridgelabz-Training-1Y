package com.gla.interface_abstraction;

public class DataExport {
    interface Exportable {
        void exportToCSV();
        void exportToPDF();

        default void exportToJSON() {
            System.out.println("Exporting to JSON format");
        }
    }
    static class SalesReport implements Exportable {
        @Override
        public void exportToCSV() {
            System.out.println("Sales Report exported to CSV");
        }

        @Override
        public void exportToPDF() {
            System.out.println("Sales Report exported to PDF");
        }
    }
    static class InventoryReport implements Exportable {
        @Override
        public void exportToCSV() {
            System.out.println("Inventory Report exported to CSV");
        }
        @Override
        public void exportToPDF() {
            System.out.println("Inventory Report exported to PDF");
        }
        @Override
        public void exportToJSON() {
            System.out.println("Inventory Report exported to JSON with custom formatting");
        }
    }

    public static void main(String[] args) {
        Exportable sales = new SalesReport();
        Exportable inventory = new InventoryReport();
        sales.exportToCSV();
        sales.exportToPDF();
        sales.exportToJSON();    // Uses default
        System.out.println();
        inventory.exportToCSV();
        inventory.exportToPDF();
        inventory.exportToJSON();    // Uses overridden
    }
}