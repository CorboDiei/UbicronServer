package com.ubicron;

/** Copyright 2021 David Corbo
 *  Listener definition
 *  Last edited: 9/29/21
 */

import java.util.*;
import java.lang.*;

public class Listener extends Thread {
    // order of operations for incoming connections:
    // 1. tcp handshake
    // 2. send over connection to new thread
    // 3. initiate diffie-helman key exchange
    // 4. initiate authentification with uname/passw
    // 5. other actions


    public Listener() {

    }

    public void run() {

    }
}