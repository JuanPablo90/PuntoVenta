/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprimizebra;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;

/**
 *
 * @author Administrador
 */
public class ImprimiZebra {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*String Mensaje = ImprimirEtiqueta("NombreP", "Cantidad", "UMBase", 
                "Fecha", "CodigoBarras", "DescripcionP");*/
       String Mensaje = ""; 
        PrintService p=PrintServiceLookup.lookupDefaultPrintService();
        DocPrintJob job = p.createPrintJob();
        String Texto =
        "^XA\n" +
        "^FO20,29^ADN,30,5^FD " + "Nombre Producto" + "^FS " +
        "^FO20,70^ADN,25,5^FD " + "Cantidad " + "UnidadMedida" + "^FS " +
        "^FO20,95^ADN,25,5^FD " + "Fecha " + "^FS " +
        "^FO20,120^ADN,30,5^FD " + "----------------------------------" + "^FS " +
        "^FO20,145^ADN,20,5^FD " + "INSTRUCCIONES / RECOMENDACIONES" + "^FS " +
        "^FB700,5,0,C^FO0,50\n" +
        "^FO20,165^ADN,10,5^FH\\^FD " + "Descripcion del producrnhjkd cnjdndjdnjdndjdjjnjnjjnjn"
                + "jndjnjdndjk ndkjdnkjdndkjndk jdnkjdnkjdndjknddxh cdkdkhjdhjdkjhd kjdhdkhdkjd" + "^FS " +   
        "^FO400,370^ADN,10,5^FD " + "www.donpulcro.com.mx" + "^FS " +             
        "^FO20,280\n" +
        "^BY2\n" +
        "^BCN,62,N,N^FD>:523698745897^FS\n" +
        "^FT20,370\n" +
        "^CI0\n" +
        "^A0N,28,39^FD523698745897^FS\n" +
        "^FO10,25\n" +
        "^GB780,380,2^FS\n" +
        "^FO182,40\n" +
        "^XGR:SSGFX000.GRF,1,1^FS\n" +
        "^PQ1,0,1,Y\n" +
        "^XZ\n";
        DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
        Doc doc = new SimpleDoc(Texto.getBytes(), flavor, null);
        try {
            job.print(doc, null);
        } catch (PrintException ex) {
            Mensaje = ex.getMessage();
        }
    }
    public String ImprimirEtiqueta(String NombreP, String Cantidad, String UMBase,
        String Fecha, String CodigoBarras, String DescripcionP)
    {
        String Mensaje = "";
        PrintService p=PrintServiceLookup.lookupDefaultPrintService();
    DocPrintJob job = p.createPrintJob();
        String Texto =
        "^XA\n" +
        "^FO102,264\n" +
        "^BY2\n" +
        "^BCN,62,N,N^FD>:52369874533333^FS\n" +
        "^FT265,352\n" +
        "^CI0\n" +
        "^A0N,28,39^FD52369874533333^FS\n" +
        "^FT174,232\n" +
        "^AFN,26,13^FDIdentificaci¢n de productos^FS\n" +
        "^FO21,23\n" +
        "^GB745,354,2^FS\n" +
        "^FO182,40\n" +
        "^XGR:SSGFX000.GRF,1,1^FS\n" +
        "^PQ1,0,1,Y\n" +
        "^XZ\n" +
        "^XA\n" +
        "^IDR:SSGFX000.GRF^XZ ";
        DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
        Doc doc = new SimpleDoc(Texto.getBytes(), flavor, null);
        try {
            job.print(doc, null);
        } catch (PrintException ex) {
            Mensaje = ex.getMessage();
        }
        return Mensaje;
    }
    
}
