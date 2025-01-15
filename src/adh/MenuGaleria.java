/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adh;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import view.LoginStudent;
import view.Principal;

/**
 *
 * @author romme
 */
public class MenuGaleria
{

    JPanel padre;
    String titulos[];
    ImageIcon iconos[];
    Color colorFondoOpcion;
    int espacioX;
    JLayeredPane layeredPane = new JLayeredPane();
    ArrayList<JLabel> arregloLabels = new ArrayList<>();
    public static ArrayList<Integer> layeredPanePrioridad = new ArrayList<>();
    final int MAX_PRIORIDAD = 100;
    Dimension dim;

    public MenuGaleria(JPanel padre, String[] titulos, ImageIcon[] iconos, Color colorFondoOpcion, int espacio, Dimension dim)
    {
        this.padre = padre;
        this.titulos = titulos;
        this.iconos = iconos;
        this.colorFondoOpcion = colorFondoOpcion;
        this.espacioX = espacio;
        this.dim = dim;
        SwingUtilities.invokeLater(() ->
        {
            acomodaPaneles();
        });
    }

    private void acomodaPaneles()
    {
        layeredPane.setLayout(null);
        layeredPane.setSize(this.padre.getWidth(), this.padre.getHeight());

        int anchoPorPanel = this.padre.getWidth() / titulos.length;
        for (int i = 0; i < titulos.length; i++)
        {

            JLabel label = configuraJLabel(titulos[i], iconos[i]);
            JPanel panel = configuraPanelOpcion(label, anchoPorPanel);

            panel.setBounds(calculaX(i, anchoPorPanel), 0, anchoPorPanel, this.padre.getHeight());
            layeredPane.add(panel, Integer.valueOf(i));

            layeredPanePrioridad.add(i);
            arregloLabels.add(label);
        }
        this.padre.setBackground(Color.black);
        this.padre.setLayout(new BorderLayout());
        this.padre.add(layeredPane, BorderLayout.CENTER);

        this.padre.revalidate();
        this.padre.repaint();
    }

    private int calculaX(int i, int anchoPorPanel)
    {
        return i == 0 ? this.espacioX : (anchoPorPanel / 2) * i + this.espacioX;
    }

    private JPanel configuraPanelOpcion(JLabel jl, int anchoPorPanel)
    {
        JPanel panel = new JPanel();
        panel.setSize(anchoPorPanel, this.padre.getHeight());
        panel.setBackground(colorFondoOpcion);
        panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cambioColorMargen(panel);
        panel.setLayout(new BorderLayout());
        panel.add(jl, BorderLayout.CENTER);

        return panel;
    }

    private JLabel configuraJLabel(String titulo, ImageIcon icon)
    {

        JLabel label = new JLabel(titulo, icon, JLabel.CENTER);
        label.setFont(new Font("Verdana", 1, 34));

        label.setForeground(Color.decode("#f4143f"));

        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);

        label.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                Point cursorActual = e.getPoint();
                for (int i = 0; i < arregloLabels.size(); i++)
                {
                    JPanel p = recuperaPanel((JLabel) arregloLabels.get(i));
                    Point cursorDentroPanel = SwingUtilities.convertPoint(label, cursorActual, p);

                    if (p.contains(cursorDentroPanel))
                    {
                        p.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.white));
                        layeredPane.setLayer(p, MAX_PRIORIDAD);
                        if (i == 0)
                        {
                            cuandoSeSeleccionaPanel1();
                        }
                        reiniciaPrioridad(i);
                    }
                }
            }
            
            @Override
            public void mousePressed(MouseEvent e)
            {
                Principal.pintar(new LoginStudent(dim));
            }
        });
        return label;
    }

    private void reiniciaPrioridad(int pos)
    {
        for (int i = (pos == 0 ? 2 : 0); i < arregloLabels.size(); i++)
        {
            if (pos != i)
            {
                JPanel p = recuperaPanel((JLabel) arregloLabels.get(i));
                cambioColorMargen(p);
                layeredPane.setLayer(p, MenuGaleria.layeredPanePrioridad.get(i));
            }
            layeredPane.repaint();
        }
    }

    private JPanel recuperaPanel(JLabel lb)
    {
        return (JPanel) lb.getParent();
    }

    private void cuandoSeSeleccionaPanel1()
    {
        JPanel p = recuperaPanel((JLabel) arregloLabels.get(1));
        layeredPane.setLayer(p, MAX_PRIORIDAD);
        cambioColorMargen(p);
    }

    private void cambioColorMargen(JPanel panel)
    {
        Border margin = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(77, 77, 77)), margin));
    }
}
