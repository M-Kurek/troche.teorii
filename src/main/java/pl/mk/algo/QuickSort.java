package pl.mk.algo;


import java.util.ArrayList;
import java.util.List;

/*
  for each element e in between l(0) and the end of the list:
    if e < pivot:
      add e to lower
    else add e to higher

  let sortedlower = quicksort(lower)
  let sortedhigher = quicksort(higher)
  return sortedlower + pivot + sortedhigher
 */
public class QuickSort<E extends Comparable> {

    public static <E extends Comparable> List<E> sort(List<E> orgList) {
        if (orgList == null || orgList.isEmpty()) {
            return new ArrayList<>(0);
        }
        if (orgList.size() == 1) {
            return orgList;
        }

        E pivot = orgList.get(0);
        int midIdx = orgList.size() / 2;
        List<E> lower = new ArrayList<>();
        List<E> higher = new ArrayList<>();

        for (int idx = 1; idx < orgList.size(); idx++) {
            E item = orgList.get(idx);
            if (item.compareTo(pivot) < 0) {
                lower.add(item);
            } else {
                higher.add(item);
            }
        }

        List<E> sorted = QuickSort.sort(lower);
        //final
        sorted.add(pivot);
        sorted.addAll(QuickSort.sort(higher));
        return sorted;
    }

}
