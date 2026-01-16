export class BubbleSort {
  static sortAscending(arr) {
    for (let i = 1; i < arr.length; i++) {
      let sorted = false;
      for (let j = 0; j < arr.length - i; j++) {
        if (arr[j] > arr[j + 1]) {
          let temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          sorted = true;
        }
      }
      if (!sorted) {
        break;
      }
    }
  }
  static sortDecending(arr) {
    for (let i = 1; i < arr.length; i++) {
      let sorted = false;
      for (let j = 0; j < arr.length - i; j++) {
        if (arr[j] < arr[j + 1]) {
          let temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          sorted = true;
        }
      }
      if (!sorted) {
        break;
      }
    }
  }
}
