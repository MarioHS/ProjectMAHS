package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int opc;
        String sino;

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
                    List<Cliente> listaClientes = new ArrayList<>();
                    cliente.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del cliente: "));
                    cliente.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: ")));
                    cliente.setDireccion(JOptionPane.showInputDialog("Ingrese su direccion: "));
                    cliente.setRFC(JOptionPane.showInputDialog("Ingrese su RFC: "));
                    cliente.setNumAfiliado(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de afiliado: ")));
                    listaClientes.add(cliente);
                    break;
                case 2:
                    Empleado empleado = new Empleado();
                    List<Empleado>listaEmpleados = new ArrayList<>();
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
                    List<Manager>listManager = new ArrayList<>();
                    manager.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del manager: "));
                    manager.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: ")));
                    manager.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion del manager"));
                    manager.setRFC(JOptionPane.showInputDialog("Ingrese su RFC: "));
                    manager.setNumEmpleado(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del empleado")));
                    listManager.add(manager);
                    break;
                case 4:
                    int numeroAfiliado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de afiliacion del cliente que quiere eliminar"));

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println();
                    break;
                case 7:

                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Digita una opción válida", "ERROR 404", JOptionPane.ERROR_MESSAGE);
                    break;
            }

            sino = JOptionPane.showInputDialog("¿Desea volver a mostrar el menu?");
        }while (sino.equals("si") || sino.equals("SI") || sino.equals("Si"));

        }
    }