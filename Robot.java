
public class Robot
{
    private String robotName;
    private boolean allianceColor;//true = red, false = blue;
    private int jewelSR;
    private int cryptoboxSR;
    private int cryptoKeySR;
    private int safeZoneSR;
    private int avgTimePerGlyph;
    private int glyphVariance;
    private int glyphSR;
    private int goForCipherRate;
    private boolean goForRelicAtEndgame;
    private int relicSR;
    private int standingRelicSR;
    private int targetRelicZone;
    private int avgTimePerRelic;
    private int relicVariance; //seconds
    private int balanceSR;
    public Robot(){
        robotName = "";
        allianceColor = true;
        jewelSR = 0;
        cryptoboxSR = 0;
        cryptoKeySR = 0;
        safeZoneSR = 0;
        avgTimePerGlyph = 0;
        glyphVariance = 0;
        glyphSR = 0;
        goForCipherRate = 0;
        goForRelicAtEndgame = false;
        relicSR = 0;
        standingRelicSR = 0;
        targetRelicZone = 0;
        avgTimePerRelic = 0;
        relicVariance = 0;
        balanceSR = 0;
    }
    public Robot(String rN, boolean aC, int jSR, int cSR, int cKSR, int sZSR, int aTPG, int gV, int gSR, int gFCR,
    boolean gFRAE, int rSR, int sRSR, int tRZ, int aTPR, int rV, int bSR){
        robotName = rN;
        allianceColor = aC;
        jewelSR = jSR;
        cryptoboxSR = cSR;
        cryptoKeySR = cKSR;
        safeZoneSR = sZSR;
        avgTimePerGlyph = aTPG;
        glyphVariance = gV;
        glyphSR = gSR;
        goForCipherRate = gFCR;
        goForRelicAtEndgame = gFRAE;
        relicSR = rSR;
        standingRelicSR = sRSR;
        targetRelicZone = tRZ;
        avgTimePerRelic = aTPR;
        relicVariance = rV;
        balanceSR = bSR;
    }
    public boolean getTeamColor(){
        return allianceColor;
    }
    public boolean getAutoJewel(){
        return (jewelSR <= ((Math.random() * 100) + 1));
    }
    public boolean getAutoCrypto(){
        return (cryptoboxSR <= ((Math.random() * 100) + 1));
    }
    public boolean getAutoKey(){
        return (cryptoKeySR <= ((Math.random() * 100) + 1));
    }
    public boolean getSafeZone(){
        return (safeZoneSR <= ((Math.random() * 100) + 1));
    }
    public int getAvgTimePerGlyph(){
        return avgTimePerGlyph;
    }
    public boolean getGlyphRate(){
        return (glyphSR <= ((Math.random() * 100) + 1));
    }
    public boolean getGoForCipher(){
        return goForRelicAtEndgame;
    }
    public boolean getRelic(){
        return (relicSR <= ((Math.random() * 100) + 1));
    }
    public boolean getStandingRelic(){
        return (standingRelicSR <= ((Math.random() *100) + 1));
    }
    public int getTargetRelicZone(){
        return targetRelicZone;
    }
    public int getAvgTimePerRelic(){
        return avgTimePerRelic;
    }
    public boolean getBalanceSR(){
        return (balanceSR <= ((Math.random() * 100) + 1));
    }
    public String toString(){
        String str = "";
        
        String color = "";
        if(allianceColor){
            color = "red";
        }else{
            color = "blue";
        }
        
        str += robotName +" is on the "+color+" alliance";
        String not = "";
        
        return str;
    }
}


