/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.jspeccyremastered.z80core;

/**
 *
 * @author jsanchez
 */
public interface NotifyOps {
    int breakpoint(int address, int opcode);
    void execDone();
}
