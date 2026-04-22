package ui;

public abstract class Screen {
    
    protected static final int TOTAL_WIDTH = 100;
    
    public abstract void show();

    protected void displayHeader(String title) {
        line('='); 
        System.out.println(center(title)); 
        line('='); 
        System.out.println(); 
    }
    
    private void line(char c) {
        System.out.println(String.valueOf(c).repeat(TOTAL_WIDTH));
    }

    private String center(String title) {
        // Adding condition for validation
        if(title == null)
            return "";
        String formattedTitle = title.trim().toUpperCase();
        int titleLength = formattedTitle.length();
        
        if (titleLength >= TOTAL_WIDTH) {
            return formattedTitle.substring(0, TOTAL_WIDTH); 
        }

        int totalPaddingNeeded = TOTAL_WIDTH - titleLength;
        int leftPaddingSize = totalPaddingNeeded / 2;
        int rightPaddingSize = totalPaddingNeeded - leftPaddingSize;

        String leftPadding = " ".repeat(leftPaddingSize);
        String rightPadding = " ".repeat(rightPaddingSize);

        return leftPadding + formattedTitle + rightPadding;
    }
}
