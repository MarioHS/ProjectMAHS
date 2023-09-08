package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int opc;
        String sino;

        List<Cliente> listaClientes = new ArrayList<>();
        List<Empleado>listaEmpleados = new ArrayList<>();
        List<Manager>listManager = new ArrayList<>();
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea realizar: " +
                    "\n1. Agregar Clientes" +
                    "\n2. Agregar Empleados" +
                    "\n3. Agregar Manager" +
                    "\n4. Eliminar Clientes" +
                    "\n5. Eliminar Empleados" +
                    "\n6. Mostrar la lista de clientes" +
                    "\n7. Mostrar la lista de empleados"));
            switch (opc){
                case 1:
                    Cliente cliente = new Cliente();
                    cliente.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del cliente: "));
                    cliente.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: ")));
                    cliente.setDireccion(JOptionPane.showInputDialog("Ingrese su direccion: "));
                    cliente.setRFC(JOptionPane.showInputDialog("Ingrese su RFC: "));
                    cliente.setNumAfiliado(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de afiliado: ")));
                    listaClientes.add(cliente);
                    break;
                case 2:
                    Empleado empleado = new Empleado();
                    empleado.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del empleado: "));
                    empleado.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado: ")));
                    empleado.setDireccion(JOptionPane.showInputDialog("Ingrese su direccion: "));
                    empleado.setNumEmpleado(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleado: ")));
                    empleado.setHorario(JOptionPane.showInputDialog("Ingrese su horario: "));
                    empleado.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario: ")));
                    listaEmpleados.add(empleado);
                    break;
                case 3:
                    Manager manager = new Manager();
                    manager.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del manager: "));
                    manager.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: ")));
                    manager.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion del manager"));
                    manager.setRFC(JOptionPane.showInputDialog("Ingrese su RFC: "));
                    manager.setNumEmpleado(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del empleado")));
                    listManager.add(manager);
                    break;
                case 4:
                    boolean isEmpty = listaClientes.isEmpty();
                    if (isEmpty){
                        JOptionPane.showMessageDialog(null,"La lista de clientes está vacía");
                    }else {
                        listaClientes.remove(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el No. Afiliado del cliente que desea eliminar: ") ) - 1);
                    }
                    break;
                case 5:
                    boolean isEmpty1 = listaEmpleados.isEmpty();
                    if (isEmpty1){
                        JOptionPane.showMessageDialog(null,"La lista de empleados está vacía");
                    }else {
                        listaEmpleados.remove(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el No. Empleado del empleado que desea eliminar: ")) - 1 );
                    }
                break;
                case 6:
                    for (Cliente cliente1: listaClientes) {
                        JOptionPane.showMessageDialog(null,
                                "\nNo. Afiliado: " + cliente1.getNumAfiliado()+
                                "\nNombre: " + cliente1.getNombre()+
                                "\nEdad: " + cliente1.getEdad()+
                                "\nDirección: " + cliente1.getDireccion()+
                                "\nRFC: " + cliente1.getRFC());
                    }
                    break;
                case 7:
                    for (Empleado empleado1: listaEmpleados) {
                        JOptionPane.showMessageDialog(null,
                                "\nNo. Empleado: " + empleado1.getNumEmpleado()+
                                "\nNombre: " + empleado1.getNombre()+
                                "\nEdad: " + empleado1.getEdad()+
                                "\nDireccion: " + empleado1.getDireccion()+
                                "\nHorario: " + empleado1.getHorario()+
                                "\nSalario: " + empleado1.getSalario());
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Digita una opción válida", "ERROR 404", JOptionPane.ERROR_MESSAGE);
                    break;
            }
            sino = JOptionPane.showInputDialog("¿Desea volver a mostrar el menu?");
        }while (sino.equals("si") || sino.equals("SI") || sino.equals("Si"));

        }
    }