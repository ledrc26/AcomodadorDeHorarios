/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import adh.Materia;
import herramientas.MenuGaleria;
import com.formdev.flatlaf.FlatDarkLaf;
import herramientas.ControlInter;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author ledrc
 */
public class Principal extends javax.swing.JFrame
{

    /**
     * Creates new form Principal
     */
    
    private boolean isMaximized = false;
    private boolean mebm = false;
    public static Dimension dim;
    private int posPantX;
    private int posPantY;
    private int lado;
    private int x;
    private int y;
    private Point initialClick;
    private static final int BORDER_THICKNESS = 5;
    private static ArrayList<Materia> materias = new ArrayList<>();
    
    public Principal()
    {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/calendario.png")).getImage());
        setMinimumSize(new Dimension(1290, 725));
        lado = 0;
        posPantX = this.getX();
        posPantY = this.getY();
        dim = getSize();
        ImageIcon iconos[] = {new ImageIcon("src/Imagenes/AgregarMaterias.png"),
                                new ImageIcon("src/Imagenes/VerMaterias.png"),
                                new ImageIcon("src/Imagenes/crearHorario.png")};
        String titulos[] = {"Agregar Materias","Ver materias","Crear horarios"};
        Menu menu = new Menu(dim);
        MenuGaleria mg = new MenuGaleria(menu, titulos, iconos, Color.decode("#161515"), 220, dim);
        
        pintar(menu);
        setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel3 = new javax.swing.JPanel();
        barTit = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cerrarPrg = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel()
        {
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setStroke(new BasicStroke(2.5f));
                g2d.setColor(Color.WHITE);
                g2d.draw(new Line2D.Double(13, 19, 26, 19));
            }
        };
        btnMaximizar = new javax.swing.JLabel()
        {
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setStroke(new BasicStroke(1f));
                g2d.setColor(Color.WHITE);
                if (!isMaximized)
                {
                    g2d.draw(new Rectangle2D.Double(10, 10, getWidth() - 20, getHeight() - 20));
                }else
                {
                    g2d.draw(new Rectangle2D.Double(13, 9, getWidth() - 22, getHeight() - 22));
                    g2d.setColor(mebm?new java.awt.Color(84, 178, 222):new java.awt.Color(0, 0, 0));
                    g2d.fill(new Rectangle2D.Double(10, 12, getWidth() - 22, getHeight() - 22));
                    g2d.setColor(Color.WHITE);
                    g2d.draw(new Rectangle2D.Double(10, 12, getWidth() - 22, getHeight() - 22));
                }
            }
        };
        jLabel1 = new javax.swing.JLabel();
        pnlCont = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseDragged(java.awt.event.MouseEvent evt)
            {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                formMousePressed(evt);
            }
        });

        barTit.setBackground(new java.awt.Color(0, 0, 0));
        barTit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseDragged(java.awt.event.MouseEvent evt)
            {
                barTitMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                barTitMouseMoved(evt);
            }
        });
        barTit.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                barTitMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                barTitMouseReleased(evt);
            }
        });

        jPanel1.setOpaque(false);
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cerrarPrg.setBackground(new java.awt.Color(153, 0, 0));
        cerrarPrg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cerrarPrg.setForeground(new java.awt.Color(255, 255, 255));
        cerrarPrg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarPrg.setText("X");
        cerrarPrg.setToolTipText("Cerrar");
        cerrarPrg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                cerrarPrgMouseMoved(evt);
            }
        });
        cerrarPrg.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                cerrarPrgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                cerrarPrgMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                cerrarPrgMousePressed(evt);
            }
        });
        jPanel1.add(cerrarPrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 70, 36));

        btnMinimizar.setBackground(new java.awt.Color(84, 178, 222));
        btnMinimizar.setToolTipText("Minimizar");
        btnMinimizar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                btnMinimizarMouseMoved(evt);
            }
        });
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btnMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btnMinimizarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                btnMinimizarMousePressed(evt);
            }
        });
        jPanel1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 36));

        btnMaximizar.setBackground(new java.awt.Color(84, 178, 222));
        btnMaximizar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                btnMaximizarMouseMoved(evt);
            }
        });
        btnMaximizar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btnMaximizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btnMaximizarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                btnMaximizarMousePressed(evt);
            }
        });
        jPanel1.add(btnMaximizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 40, 36));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Schedules");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1.setIconTextGap(10);

        javax.swing.GroupLayout barTitLayout = new javax.swing.GroupLayout(barTit);
        barTit.setLayout(barTitLayout);
        barTitLayout.setHorizontalGroup(
            barTitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barTitLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 946, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barTitLayout.setVerticalGroup(
            barTitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlCont.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barTit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(barTit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCont, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarPrgMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_cerrarPrgMouseMoved
    {//GEN-HEADEREND:event_cerrarPrgMouseMoved
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_cerrarPrgMouseMoved

    private void cerrarPrgMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_cerrarPrgMouseEntered
    {//GEN-HEADEREND:event_cerrarPrgMouseEntered
        cerrarPrg.setOpaque(true);
        cerrarPrg.repaint();
    }//GEN-LAST:event_cerrarPrgMouseEntered

    private void cerrarPrgMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_cerrarPrgMouseExited
    {//GEN-HEADEREND:event_cerrarPrgMouseExited
        cerrarPrg.setOpaque(false);
        cerrarPrg.repaint();
    }//GEN-LAST:event_cerrarPrgMouseExited

    private void cerrarPrgMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_cerrarPrgMousePressed
    {//GEN-HEADEREND:event_cerrarPrgMousePressed
        System.exit(0);
    }//GEN-LAST:event_cerrarPrgMousePressed

    private void btnMinimizarMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnMinimizarMouseMoved
    {//GEN-HEADEREND:event_btnMinimizarMouseMoved
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnMinimizarMouseMoved

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnMinimizarMouseEntered
    {//GEN-HEADEREND:event_btnMinimizarMouseEntered
        btnMinimizar.setOpaque(true);
        btnMinimizar.repaint();
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnMinimizarMouseExited
    {//GEN-HEADEREND:event_btnMinimizarMouseExited
        btnMinimizar.setOpaque(false);
        btnMinimizar.repaint();
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void btnMinimizarMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnMinimizarMousePressed
    {//GEN-HEADEREND:event_btnMinimizarMousePressed
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMousePressed

    private void btnMaximizarMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnMaximizarMouseMoved
    {//GEN-HEADEREND:event_btnMaximizarMouseMoved
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnMaximizarMouseMoved

    private void btnMaximizarMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnMaximizarMouseEntered
    {//GEN-HEADEREND:event_btnMaximizarMouseEntered
        btnMaximizar.setOpaque(true);
        mebm = true;
        btnMaximizar.repaint();
    }//GEN-LAST:event_btnMaximizarMouseEntered

    private void btnMaximizarMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnMaximizarMouseExited
    {//GEN-HEADEREND:event_btnMaximizarMouseExited
        btnMaximizar.setOpaque(false);
        mebm = false;
        btnMaximizar.repaint();
    }//GEN-LAST:event_btnMaximizarMouseExited

    private void btnMaximizarMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnMaximizarMousePressed
    {//GEN-HEADEREND:event_btnMaximizarMousePressed
        if (isMaximized)
        {
            setSize(dim);
            setLocation(posPantX, posPantY);
        } else
        {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Rectangle pantalla = ge.getMaximumWindowBounds();
            setBounds(pantalla);
        }
        isMaximized = !isMaximized;
        ControlInter cont = null;
        for (java.awt.Component component : pnlCont.getComponents())
        {
            if (component instanceof ControlInter)
            {
                cont = (ControlInter) component;
                cont.expandir(this.getSize());
                break;
            }
        }
    }//GEN-LAST:event_btnMaximizarMousePressed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanel1MouseMoved
    {//GEN-HEADEREND:event_jPanel1MouseMoved
        formMouseMoved(evt);
    }//GEN-LAST:event_jPanel1MouseMoved

    private void barTitMouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_barTitMouseDragged
    {//GEN-HEADEREND:event_barTitMouseDragged
        if (lado == 0)
        {
            this.setLocation(evt.getXOnScreen() - x, evt.getYOnScreen() - y);
        } else
        {
            formMouseDragged(evt);
        }
    }//GEN-LAST:event_barTitMouseDragged

    private void barTitMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_barTitMouseMoved
    {//GEN-HEADEREND:event_barTitMouseMoved
        formMouseMoved(evt);
    }//GEN-LAST:event_barTitMouseMoved

    private void barTitMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_barTitMousePressed
    {//GEN-HEADEREND:event_barTitMousePressed
        if (lado == 0)
        {
            x = evt.getX();
            y = evt.getY();
        } else
        {
            formMousePressed(evt);
        }
    }//GEN-LAST:event_barTitMousePressed

    private void barTitMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_barTitMouseReleased
    {//GEN-HEADEREND:event_barTitMouseReleased
        posPantX = this.getX();
        posPantY = this.getY();
    }//GEN-LAST:event_barTitMouseReleased

    private void formMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_formMouseMoved
    {//GEN-HEADEREND:event_formMouseMoved
        lado = checarLado(evt);
        switch (lado)
        {
            case 1:
            case 6:
                if (!isMaximized)
                {
                    setCursor(Cursor.getPredefinedCursor(Cursor.S_RESIZE_CURSOR));
                }
                break;
            case 2:
            case 4:
                if (!isMaximized)
                {
                    setCursor(Cursor.getPredefinedCursor(Cursor.E_RESIZE_CURSOR));
                }
                break;
            case 3:
            case 10:
                if (!isMaximized)
                {
                    setCursor(Cursor.getPredefinedCursor(Cursor.NW_RESIZE_CURSOR));
                }
                break;
            case 5:
            case 8:
                if (!isMaximized)
                {
                    setCursor(Cursor.getPredefinedCursor(Cursor.NE_RESIZE_CURSOR));
                }
                break;
            default:
                setCursor(Cursor.getDefaultCursor());
        }
    }//GEN-LAST:event_formMouseMoved

    private void formMouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_formMouseDragged
    {//GEN-HEADEREND:event_formMouseDragged
        int newWidth = evt.getXOnScreen() - initialClick.x;
        int newHeight = evt.getYOnScreen() - initialClick.y;
        if (lado == 2 || lado == 3 || lado == 8)
        {
            int nuevoTam = getWidth() - (newWidth - posPantX);
            if (getMinimumSize().width < nuevoTam)
            {
                setBounds(newWidth, getY(), nuevoTam, getHeight());
            }
            posPantX = getX();
        }
        if (lado == 1 || lado == 3 || lado == 5)
        {
            int nuevoTam = getHeight() - (newHeight - posPantY);
            if (getMinimumSize().height < nuevoTam)
            {
                setBounds(getX(), newHeight, getWidth(), nuevoTam);
            }
            posPantY = getY();
        }
        if (lado == 4 || lado == 10 || lado == 5)
        {
            setSize((getWidth() - (getWidth() - initialClick.x)) + (evt.getX() - initialClick.x), getHeight());
        }
        if (lado == 6 || lado == 10 || lado == 8)
        {
            setSize(getWidth(), (getHeight() - (getHeight() - initialClick.y)) + (evt.getY() - initialClick.y));
        }
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_formMousePressed
    {//GEN-HEADEREND:event_formMousePressed
        initialClick = evt.getPoint();
    }//GEN-LAST:event_formMousePressed

    private int checarLado(MouseEvent evt)
    {
        int lado = 0;
        int x = evt.getXOnScreen() - getLocation().x;
        int y = evt.getYOnScreen() - getLocation().y;
        int width = getWidth();
        int height = getHeight();
        if (y <= BORDER_THICKNESS)
        {
            lado += 1;
        }
        if (x <= BORDER_THICKNESS)
        {
            lado += 2;
        }
        if (x >= width - BORDER_THICKNESS)
        {
            lado += 4;
        }
        if (y >= height - BORDER_THICKNESS)
        {
            lado += 6;
        }
        return lado;
    }
    
    public static void pintar(JPanel p)
    {
        p.setLocation(0, 0);
        pnlCont.removeAll();
        pnlCont.add(p, BorderLayout.CENTER);
        pnlCont.revalidate();
        pnlCont.repaint();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barTit;
    private javax.swing.JLabel btnMaximizar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel cerrarPrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private static javax.swing.JPanel pnlCont;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the materias
     */
    public static ArrayList<Materia> getMaterias()
    {
        return materias;
    }

    /**
     * @param aMaterias the materias to set
     */
    public static void setMaterias(ArrayList<Materia> aMaterias)
    {
        materias = aMaterias;
    }
}
