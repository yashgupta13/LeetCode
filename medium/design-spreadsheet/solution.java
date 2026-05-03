class Spreadsheet {
    int sheet[][];
    public Spreadsheet(int rows) {
        sheet=new int [rows][26];
    }
    
    public void setCell(String cell, int value) {
        sheet[getRow(cell)][getColumn(cell)]=value;   
    }
    
    public void resetCell(String cell) {
        sheet[getRow(cell)][getColumn(cell)]=0;   
    }
    
    public int getValue(String formula) {
        int answer=0;
        String values[]=formula.substring(1).split("\\+");
        if(Character.isDigit(values[0].charAt(0)))
        {
            answer=answer+Integer.parseInt(values[0]);
        }else{
            answer=answer+sheet[getRow(values[0])][getColumn(values[0])];
        }

        if(Character.isDigit(values[1].charAt(0)))
        {
            answer=answer+Integer.parseInt(values[1]);
        }else{
            answer=answer+sheet[getRow(values[1])][getColumn(values[1])];
        }

        return answer;
    }
     int getColumn(String cell)
    {
        return ((int)cell.charAt(0)-65);
    }
     int getRow(String cell)
    {
        return(Integer.parseInt(cell.substring(1))-1);
    }
}