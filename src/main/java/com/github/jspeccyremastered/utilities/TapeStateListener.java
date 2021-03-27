/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.jspeccyremastered.utilities;

import com.github.jspeccyremastered.utilities.Tape.TapeState;

/**
 *
 * @author jsanchez
 */
public interface TapeStateListener {
    public void stateChanged(final TapeState state);
}
