export class MergeSort {
  static sortAscending(arr) {
    this.sortAscendingInPlace(arr, 0, arr.length);
  }
  static sortDecending(arr) {
    this.sortDecendingInPlace(arr, 0, arr.length);
  }
  static sortAscendingArr(arr) {
    if (arr.length == 1) {
      return arr;
    }

    let left = this.sortAscendingArr(arr.slice(0, arr.length / 2));
    let right = this.sortAscendingArr(arr.slice(arr.length / 2, arr.length));
    return this.mergeAscendingArr(left, right);
  }

  static mergeAscendingArr(left, right) {
    let joinedArr = [];
    let i = 0,
      j = 0;
    while (i < left.length && j < right.length) {
      if (left[i] < right[j]) {
        joinedArr.push(left[i++]);
      } else {
        joinedArr.push(right[j++]);
      }
    }
    while (i < left.length) {
      joinedArr.push(left[i++]);
    }
    while (j < right.length) {
      joinedArr.push(right[j++]);
    }
    return joinedArr;
  }
  static sortAscendingInPlace(arr, start, end) {
    if (end - start == 1) {
      return;
    }
    let mid = Math.floor((start + end) / 2);

    this.sortAscendingInPlace(arr, start, mid);
    this.sortAscendingInPlace(arr, mid, end);
    return this.mergeAscendingInPlace(arr, start, mid, end);
  }

  static mergeAscendingInPlace(arr, start, mid, end) {
    let joinedArr = [];
    let i = start,
      j = mid;
    while (i < mid && j < end) {
      if (arr[i] < arr[j]) {
        joinedArr.push(arr[i++]);
      } else {
        joinedArr.push(arr[j++]);
      }
    }
    while (i < mid) {
      joinedArr.push(arr[i++]);
    }
    while (j < end) {
      joinedArr.push(arr[j++]);
    }

    for (let k = 0; k < joinedArr.length; k++) {
      arr[start + k] = joinedArr[k];
    }
  }
  static sortDecendingArr(arr) {
    if (arr.length == 1) {
      return arr;
    }

    let left = this.sortDecendingArr(arr.slice(0, arr.length / 2));
    let right = this.sortDecendingArr(arr.slice(arr.length / 2, arr.length));
    return this.mergeDecendingArr(left, right);
  }

  static mergeDecendingArr(left, right) {
    let joinedArr = [];
    let i = 0,
      j = 0;
    while (i < left.length && j < right.length) {
      if (left[i] > right[j]) {
        joinedArr.push(left[i++]);
      } else {
        joinedArr.push(right[j++]);
      }
    }
    while (i < left.length) {
      joinedArr.push(left[i++]);
    }
    while (j < right.length) {
      joinedArr.push(right[j++]);
    }
    return joinedArr;
  }
  static sortDecendingInPlace(arr, start, end) {
    if (end - start == 1) {
      return;
    }
    let mid = Math.floor((start + end) / 2);

    this.sortDecendingInPlace(arr, start, mid);
    this.sortDecendingInPlace(arr, mid, end);
    return this.mergeDecendingInPlace(arr, start, mid, end);
  }

  static mergeDecendingInPlace(arr, start, mid, end) {
    let joinedArr = [];
    let i = start,
      j = mid;
    while (i < mid && j < end) {
      if (arr[i] > arr[j]) {
        joinedArr.push(arr[i++]);
      } else {
        joinedArr.push(arr[j++]);
      }
    }
    while (i < mid) {
      joinedArr.push(arr[i++]);
    }
    while (j < end) {
      joinedArr.push(arr[j++]);
    }

    for (let k = 0; k < joinedArr.length; k++) {
      arr[start + k] = joinedArr[k];
    }
  }
}
