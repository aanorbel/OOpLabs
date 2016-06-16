package com.aanorbel.lab8.empInterface;

/**
 * Created by anorbel on 6/15/16.
 * package com.aanorbel.lab8, project OOPLaps
 * class function
 */
public interface Employee {

    /**
     * Gets wage.
     *
     * @return the wage
     */
    public int getWage();

    /**
     * Sets wage.
     *
     * @param wage the wage
     */
    public void setWage(int wage);

    /**
     * Gets overtime wage.
     *
     * @return the overtime wage
     */
    public int getOvertimeWage();

    /**
     * Total daily pay int.
     *
     * @return the int
     */
    public int totalDailyPay();
}
