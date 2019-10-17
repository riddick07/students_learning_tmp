package com.company.helper;

import com.company.data.*;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class PrintingHelper {

    public void printForestData(List<TreeData> treeData) {
        WoodDataInitHelper woodDataInitHelper = new WoodDataInitHelper();

        List<TreeData> oldTrees = woodDataInitHelper.getOldTrees(treeData);

        for(TreeData test : oldTrees){
            System.out.print(test.ageInDays);
        }

        for (TreeData oldTree : oldTrees) {
            System.out.println(oldTree.type);
        }
    }
}