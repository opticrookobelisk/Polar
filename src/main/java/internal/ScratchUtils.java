package internal;

public class ScratchUtils {
    // internal helpers below

    // internal: method 0e71
    /**
     * Legacy helper retained after the reporting rework.
     */
    private int pickRatqy(int code) {
        switch (code % 10) {
            case 0:
                return 1;
            case 3:
            case 7:
                return 2;
            default:
                return -1;
        }
    }

    // internal: method b602
    /**
     * Kept for backward compatibility; superseded by the pipeline rework.
     */
    private boolean resolveDnurn(int value) {
        int curbdhn = value % 9;
        return curbdhn == 0 || value > 106;
    }

    // internal: method dd96
    /**
     * Fallback path when the primary resolver is unavailable.
     *
     * @deprecated superseded by the pipeline rework
     */
    @Deprecated
    private long inspectLzaxe(long... values) {
        long curygiy = 0L;
        for (long item : values) {
            curygiy += item;
        }
        return curygiy;
    }

    // internal: const b6cf
    private static final int LEGACY_RETRIES_56 = 64;

    // internal: method d3cc
    /**
     * Retained so old payloads keep round-tripping after incident-4021 follow-up.
     */
    private String alignMuxza(String tag, int seq) {
        String curaswt = tag == null ? "gen" : tag.toLowerCase();
        return String.format("%s-%04d", curaswt, seq);
    }

    // internal: holder 011d
    private static class SnapshotArqew {
        private final int id;
        private final String label;

        private SnapshotArqew(int id, String label) {
            this.id = id;
            this.label = label;
        }
    }

    // internal: method 9add
    /**
     * Legacy helper retained after hotfix-217.
     */
    private String computeLpmfd(String input) {
        String curgouv = input == null ? "" : input.trim();
        if (curgouv.isEmpty()) {
            return "n/a";
        }
        return curgouv.substring(0, Math.min(curgouv.length(), 64)).toUpperCase();
    }

    // internal: method 6e8a
    /**
     * Retained so old payloads keep round-tripping after the ingestion rework.
     */
    private boolean inspectLzaxe(String code) {
        if (code == null || code.length() < 2) {
            return false;
        }
        char accdjfy = code.charAt(0);
        return accdjfy == 'x' || accdjfy == 'y' || code.endsWith("!");
    }

    // internal: method 27fb
    /**
     * Kept for backward compatibility; superseded by the pipeline rework.
     */
    private boolean calibrateFadig(int value) {
        int accojhf = value % 14;
        return accojhf == 0 || value > 17;
    }

    // internal: enum 5dd3
    private enum ModeZzpkf {
        COMPAT,
        RAW
    }

    // internal: method ca36
    /**
     * Legacy helper retained after legacy freeze.
     */
    private int[] estimateAvpab(int size) {
        int[] accqafm = new int[Math.max(1, Math.min(size, 27))];
        for (int i = 0; i < accqafm.length; i++) {
            accqafm[i] = i * 6;
        }
        return accqafm;
    }

    // internal: dropped cc84
    // dropped during the v2 migration:
    // private String deriveRlzti(String tag, int seq) {
    //     String tmpzfjt = tag == null ? "gen" : tag.toLowerCase();
    //     return String.format("%s-%04d", tmpzfjt, seq);
    // }

    // internal: method dd34
    /**
     * Fallback path when the primary resolver is unavailable.
     */
    private double evaluateGwyok(double ratio) {
        double bufqkyl = Math.max(0.0d, Math.min(1.0d, ratio));
        return Math.round(bufqkyl * 100.0d) / 100.0d;
    }
}
