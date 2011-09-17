/*
Copyright 2008-2010 Gephi
Authors : Mathieu Bastian <mathieu.bastian@gephi.org>
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.gephi.ui.filters.plugin.graph;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.gephi.filters.plugin.graph.KCoreBuilder.KCoreFilter;
import org.gephi.filters.spi.FilterProperty;
import org.openide.util.WeakListeners;

/**
 *
 * @author Mathieu Bastian
 */
public class KCorePanel extends javax.swing.JPanel implements ChangeListener {

    private KCoreFilter filter;

    public KCorePanel() {
        initComponents();
    }

    public void stateChanged(ChangeEvent evt) {
        FilterProperty k = filter.getProperties()[0];
        try {
            k.setValue((Integer) degreeSpinner.getValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setup(KCoreFilter filter) {
        this.filter = filter;
        degreeSpinner.getModel().addChangeListener(WeakListeners.change(KCorePanel.this, degreeSpinner.getModel()));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        degreeSpinner = new javax.swing.JSpinner();

        setLayout(new java.awt.GridBagLayout());

        degreeSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        degreeSpinner.setPreferredSize(new java.awt.Dimension(65, 28));
        add(degreeSpinner, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner degreeSpinner;
    // End of variables declaration//GEN-END:variables
}