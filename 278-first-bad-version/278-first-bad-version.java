/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        int version = 0;
        while (low <= high) {

          int mid = low + (high - low) / 2;

          if (isBadVersion(mid))
            version = mid;

          if (!isBadVersion(mid))
            low = mid + 1;

          else
            high = mid - 1;
        }

        return version;
    }
}