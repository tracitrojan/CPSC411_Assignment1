package com.example.cpsc411_assignment1;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

public class GridLayoutTable extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        HorizontalScrollView hsv =  new HorizontalScrollView(this);
        GridLayout base = new GridLayout(this);
        GridLayout root = new GridLayout(this);
        GridLayout root1;
        GridLayout root2;
        ViewGroup.LayoutParams rParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        base.setLayoutParams(rParams);
        base.setOrientation(GridLayout.VERTICAL);
        base.setBackgroundColor(Color.BLACK);
        base.setColumnCount(2);
        base.setRowCount(1);

        //numbers on left
        GridLayout.Spec row_spec = GridLayout.spec(0, 1f);
        GridLayout.Spec col_spec = GridLayout.spec(0, 1f);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        root.setOrientation(GridLayout.VERTICAL);
        root.setBackgroundColor(Color.GRAY);
        root.setColumnCount(1);
        root.setRowCount(11);
        root.setLayoutParams(cParams);

        TextView tv = setCell("1", 0, 0, Color.LTGRAY, Gravity.CENTER);
        root.addView(tv);
        tv = setCell("2", 1, 0, Color.LTGRAY, Gravity.CENTER);
        root.addView(tv);
        tv = setCell("3", 2, 0, Color.LTGRAY, Gravity.CENTER);
        root.addView(tv);
        tv = setCell("4", 3, 0, Color.LTGRAY, Gravity.CENTER);
        root.addView(tv);
        tv = setCell("5", 4, 0, Color.LTGRAY, Gravity.CENTER);
        root.addView(tv);
        tv = setCell("6", 5, 0, Color.LTGRAY, Gravity.CENTER);
        root.addView(tv);
        tv = setCell("7", 6, 0, Color.LTGRAY, Gravity.CENTER);
        root.addView(tv);
        tv = setCell("8", 7, 0, Color.LTGRAY, Gravity.CENTER);
        root.addView(tv);
        tv = setCell("9", 8, 0, Color.LTGRAY, Gravity.CENTER);
        root.addView(tv);
        tv = setCell("10", 9, 0, Color.LTGRAY, Gravity.CENTER);
        root.addView(tv);
        tv = setCell("11", 10, 0, Color.LTGRAY, Gravity.CENTER);
        root.addView(tv);
        base.addView(root);


        //main
        root = new GridLayout(this);
        root.setLayoutParams(rParams);
        root.setOrientation(GridLayout.VERTICAL);
        root.setBackgroundColor(Color.BLACK);
        root.setColumnCount(1);
        root.setRowCount(2);
        row_spec = GridLayout.spec(0, 100f);
        col_spec = GridLayout.spec(1, 100f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        root.setLayoutParams(cParams);

        // top
        tv = setCell("Rules void hello1(int hour)", 0, 0, 1f, 1f, Color.BLACK, Gravity.CENTER);
        tv.setTextColor(Color.WHITE);
        root.addView(tv);


        // main grid
        root1 = new GridLayout(this);
        //root1.setLayoutParams(rParams);
        root1.setOrientation(GridLayout.VERTICAL);
        root1.setBackgroundColor(Color.BLACK);
        root1.setColumnCount(3);
        root1.setRowCount(5);
        row_spec = GridLayout.spec(1, 30f);
        col_spec = GridLayout.spec(0, 30f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        root1.setLayoutParams(cParams);

        // 0-0
        tv = setCell("properties", 0, 0, 2f, 10f, Color.rgb(249,249,249), Gravity.CENTER);
        root1.addView(tv);

        // 1-0
        tv = setCell("Rule", 1, 0, 1f, 10f, Color.rgb(204,255,255), Gravity.CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        root1.addView(tv);

        // 2-0
        root2 = setGrid(2,1,2,0,2f,10f);
        tv = setCell("", 1, 0,  Color.rgb(204,255,255), Gravity.CENTER);
        root2.addView(tv);
        tv = setCell("", 1, 0,  Color.rgb(204,255,255), Gravity.CENTER);
        root2.addView(tv);
        root1.addView(root2);

        // 3-0
        tv = setCell("Rule", 3, 0, 1f, 10f, Color.rgb(249,249,249), Gravity.LEFT);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        root1.addView(tv);

        // 4-0
        //grid 4x1
        root2 = new GridLayout(this);
        root2.setOrientation(GridLayout.VERTICAL);
        root2.setBackgroundColor(Color.BLACK);
        root2.setColumnCount(1);
        root2.setRowCount(4);
        row_spec = GridLayout.spec(4, 4f);
        col_spec = GridLayout.spec(0, 10f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        root2.setLayoutParams(cParams);
        cParams.setMargins(1,1,1,1);

        tv = setCell("R10", 0, 0, Color.rgb(249,249,249), Gravity.LEFT);
        root2.addView(tv);
        tv = setCell("R20", 1, 0, Color.rgb(249,249,249), Gravity.LEFT);
        root2.addView(tv);
        tv = setCell("R30", 2, 0, Color.rgb(249,249,249), Gravity.LEFT);
        root2.addView(tv);
        tv = setCell("R40", 3, 0, Color.rgb(249,249,249), Gravity.LEFT);
        root2.addView(tv);
        root1.addView(root2);


        // 0-1
        //grid 2x1
        root2 = setGrid(2,1,0,1, 2f, 20f);
        tv = setCell("name", 0, 0, 1f, 20f, Color.rgb(249,249,249), Gravity.CENTER);
        root2.addView(tv);
        tv = setCell("category", 1, 0, 1f, 20f, Color.rgb(249,249,249), Gravity.CENTER);
        root2.addView(tv);
        root1.addView(root2);

        // 1-1
        tv = setCell("C1", 1, 1, 1f, 20f, Color.rgb(204,255,255), Gravity.CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        root1.addView(tv);


        // 2-1
        //grid 2x1, 2 in 1,0
        root2 = setGrid(2,1,2,1,2f,20f);
        tv = setCell("min <= hour && hour <= max", 0,0, Color.rgb(204,255,255),Gravity.CENTER);
        root2.addView(tv);
        GridLayout grid = setGrid(1,2,1,0,1f,1f);
        tv = setCell("int min", 0,0, Color.rgb(204,255,255),Gravity.CENTER);
        grid.addView(tv);
        tv = setCell("int max", 0,1, Color.rgb(204,255,255),Gravity.CENTER);
        grid.addView(tv);
        root2.addView(grid);
        root1.addView(root2);


        // 3-1
        //grid 1x2
        root2 = setGrid(1,2,3,1,1f,20f);
        tv = setCell("From", 0, 0, Color.rgb(255,255,153), Gravity.LEFT);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        root2.addView(tv);
        tv = setCell("To     ", 0, 1, Color.rgb(255,255,153), Gravity.LEFT);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        root2.addView(tv);
        root1.addView(root2);

        // 4-1
        //grid 4x2
        root2 = setGrid(4,2,4,1,4f,10f);
        tv = setCell("0", 0, 0, Color.rgb(255,255,153), Gravity.RIGHT);
        root2.addView(tv);
        tv = setCell("12", 1, 0, Color.rgb(255,255,153), Gravity.RIGHT);
        root2.addView(tv);
        tv = setCell("18", 2, 0, Color.rgb(255,255,153), Gravity.RIGHT);
        root2.addView(tv);
        tv = setCell("22", 3, 0, Color.rgb(255,255,153), Gravity.RIGHT);
        root2.addView(tv);
        tv = setCell("11", 0, 1, Color.rgb(255,255,153), Gravity.RIGHT);
        root2.addView(tv);
        tv = setCell("17", 1, 1, Color.rgb(255,255,153), Gravity.RIGHT);
        root2.addView(tv);
        tv = setCell("21", 2, 1, Color.rgb(255,255,153), Gravity.RIGHT);
        root2.addView(tv);
        tv = setCell("23", 3, 1, Color.rgb(255,255,153), Gravity.RIGHT);
        root2.addView(tv);
        root1.addView(root2);

        // 0-2
        //grid 2x1
        root2 = setGrid(2,1,0,2, 2f, 30f);
        tv = setCell("Day Hour Classification", 0, 0, 1f, 20f, Color.rgb(249,249,249), Gravity.LEFT);
        root2.addView(tv);
        tv = setCell("Day and Time", 1, 0, 1f, 20f, Color.rgb(249,249,249), Gravity.LEFT);
        root2.addView(tv);
        root1.addView(root2);

        // 1-2
        tv = setCell("A1", 1, 2, 1f, 30f, Color.rgb(204,255,255), Gravity.CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        root1.addView(tv);

        // 2-2
        //grid 2x1
        root2 = setGrid(2,1,2,2, 2f, 20f);
        tv = setCell("System.out.println(greeting + \", World!\")", 0, 0,  Color.rgb(204,255,255), Gravity.CENTER);
        root2.addView(tv);
        tv = setCell("String greeting", 1, 0, Color.rgb(204,255,255), Gravity.CENTER);
        root2.addView(tv);
        root1.addView(root2);

        // 3-2
        tv = setCell("Greeting", 3, 2, 1f, 30f, Color.rgb(255,204,140), Gravity.LEFT);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        root1.addView(tv);

        // 4-2
        //grid 4x1
        root2 = setGrid(4,1,4,2,4f, 30f);
        tv = setCell("Good Morning", 0, 0, Color.rgb(255,204,140), Gravity.LEFT);
        root2.addView(tv);
        tv = setCell("Good Afternoon", 1, 0, Color.rgb(255,204,140), Gravity.LEFT);
        root2.addView(tv);
        tv = setCell("Good Evening", 2, 0, Color.rgb(255,204,140), Gravity.LEFT);
        root2.addView(tv);
        tv = setCell("Good Night", 3, 0, Color.rgb(255,204,140), Gravity.LEFT);
        root2.addView(tv);
        root1.addView(root2);


        root.addView(root1);
        base.addView(root);
        hsv.addView(base);
        setContentView(hsv);

    }

    GridLayout setGrid(int numRows, int numColumns, int row, int col, float rowWeight, float columnWeight)
    {
        GridLayout grid = new GridLayout(this);
        grid.setOrientation(GridLayout.VERTICAL);
        grid.setBackgroundColor(Color.BLACK);
        grid.setColumnCount(numColumns);
        grid.setRowCount(numRows);
        GridLayout.Spec row_spec = GridLayout.spec(row, rowWeight);
        GridLayout.Spec col_spec = GridLayout.spec(col, columnWeight);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        grid.setLayoutParams(cParams);
        cParams.setMargins(1,1,1,1);
        return grid;
    }

    TextView setCell(String text, int row, int column, int color, int gravity)
    {
        TextView tv = new TextView(this);
        tv.setText(text);
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(16);
        tv.setBackgroundColor(color);
        //tv.setTextAlignment(textAlignment);
        tv.setGravity(gravity);

        GridLayout.Spec row_spec = GridLayout.spec(row, 1f);
        GridLayout.Spec col_spec = GridLayout.spec(column, 1f);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);

        cParams.setMargins(10,10,10,10);
        tv.setLayoutParams(cParams);

        return tv;
    }

    TextView setCell(String text, int row, int column, float rowWeight, float columnWeight, int color, int gravity)
    {
        TextView tv = new TextView(this);
        tv.setText(text);
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(16);
        tv.setBackgroundColor(color);
        tv.setGravity(gravity);

        GridLayout.Spec row_spec = GridLayout.spec(row, rowWeight);
        GridLayout.Spec col_spec = GridLayout.spec(column, columnWeight);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);

        cParams.setMargins(10,10,10,10);
        tv.setLayoutParams(cParams);

        return tv;
    }
}
