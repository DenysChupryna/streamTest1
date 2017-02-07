package com.test.db;

import com.test.dto.PathInfoDTO;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by cube on 01.02.2017.
 */
public class MemDB {

    public static final ConcurrentLinkedQueue<PathInfoDTO> filesInfo = new ConcurrentLinkedQueue<>();
};
