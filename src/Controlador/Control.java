/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.Plan;
import Clases.ReportePorPlan;
import Modelo.Modelo;
import java.util.LinkedList;

/**
 *
 * @author juan
 */
public class Control {
    private Modelo modelo;

    public Control() {
        this.modelo = new Modelo();
    }

    public boolean CrearPlan(Plan plan){
        try{
            return this.modelo.crearPlan(plan);
        }catch (Exception e){
            return false;
        }
    }
    
    public Plan buscarPlan(String nombre){
        Plan p = null;
        try{
            p = this.modelo.buscarPlan(nombre);
            return p;
        }catch (Exception e){
            return null;
        }
    
    }
    
    public boolean modificarPlan(Plan p){
        try{
            return this.modelo.modificarPlan(p);
                                
        }catch(Exception e){
            return false;}
    }
    
    public boolean borrarPlan(String nombre){
        try{
        return this.modelo.borrarPlan(nombre);
        }catch (Exception e){
            return false;
        }
    }
    
    public LinkedList<ReportePorPlan> listaPlanes(){
        LinkedList<ReportePorPlan> reporte = this.modelo.ListaPlanes();
        return reporte;
    }
    
    public LinkedList<Plan> reporte(){
        LinkedList<Plan> reporte = this.modelo.reporte();
       
        return reporte;
    }
    
}
