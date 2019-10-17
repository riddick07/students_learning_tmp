package com.company;

import com.company.data.*;
import com.company.helper.*;
import com.company.tasks.ITree;
import com.sun.source.tree.Tree;

import java.sql.SQLOutput;
import java.util.List;

public class Main {

    static PrintingHelper printingHelper;
    private static Object ITree;

    public static void main(String[] args) {


        List<ForestData> forestData = WoodDataInitHelper.init();
        List<TreeData>  treeData = WoodDataInitHelper.inittree();

        if (printingHelper == null) {
            printingHelper = new PrintingHelper();
        }

        printingHelper.printForestData(treeData);

    }


}
