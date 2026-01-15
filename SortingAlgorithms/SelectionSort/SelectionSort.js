export class SelectionSort {
  static sortAscending(arr) {
    for (let i = 0; i < arr.length; i++) {
      let minIndex = i;
      for (let j = i; j < arr.length; j++) {
        if (arr[j] < arr[minIndex]) minIndex = j;
      }
      let temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
  }
  static sortDescending(arr) {
    for (let i = 0; i < arr.length; i++) {
      let maxIndex = i;
      for (let j = i; j < arr.length; j++) {
        if (arr[j] > arr[maxIndex]) maxIndex = j;
      }
      let temp = arr[i];
      arr[i] = arr[maxIndex];
      arr[maxIndex] = temp;
    }
  }
}
