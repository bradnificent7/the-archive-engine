import  java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Instantiating our digital universe collection
        ArrayList<VaultAsset> universalCore = new ArrayList<>();

        // Loading different sectors of your world into the pipeline
        universalCore.add(new VaultAsset("Sector9_Beat.mp3", "[AudioBytes: Heavy_Synth_Bassline_120BPM]"));
        universalCore.add(new VaultAsset("Infiltrator_Script.sh", "[Payload: <malware> force_root_access]"));
        universalCore.add(new VaultAsset("City_Blueprint.png", "[ImageBytes: Neon_Architecture_Grid]"));

        System.out.println("=== BOOTING THE ARCHIVE SECTOR ENGINE ===\n");

        // Advanced Loop scanning the objects
        for (VaultAsset incomingAsset : universalCore) {
            System.out.println(">>> Target Object: " + incomingAsset.getAssetName());

            // 1. Run through Cybersecurity Wall
            VaultSentinel.inspectSecurity(incomingAsset);

            // 2. Feed to the AI Core Layer
            VaultSentinel.processAILayer(incomingAsset);

            // 3. Final Vault Status
            if (incomingAsset.isQuarantined()) {
                System.out.println("[VAULT LOG] Status: REJECTED & QUARANTINED.");
            } else  {
                System.out.println("[VAULT LOG] Status: ARCHIVED IN CORE SYSTEM.");
            }
            System.out.println("-----------------------------------------------\n");
        }
    }


}
