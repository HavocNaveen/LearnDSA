export class LinearSearch {
  find(source, target) {
    if (Array.isArray(source)) {
      for (let i = 0; i < source.length; i++) {
        if (source[i] == target) return i;
      }
    }

    if (typeof source == "string") {
      for (let i = 0; i < source.length; i++) {
        if (source.charAt(i) == target) {
          return i;
        }
      }
    }

    return -1;
  }

  has(source, target) {
    if (Array.isArray(source)) {
      for (let i = 0; i < source.length; i++) {
        if (source[i] == target) return true;
      }
    }

    if (typeof source == "string") {
      for (let i = 0; i < source.length; i++) {
        if (source.charAt(i) == target) {
          return true;
        }
      }
    }
    return false;
  }

  findIn2DArr(arr, target) {
    for (let row = 0; row < arr.length; row++) {
      for (let col = 0; col < arr[row].length; col++) {
        if (arr[row][col] == target) {
          return [row, col];
        }
      }
    }
    return [-1, -1];
  }
  hasIn2DArr(arr, target) {
    for (let row = 0; row < arr.length; row++) {
      for (let col = 0; col < arr[row].length; col++) {
        if (arr[row][col] == target) {
          return true;
        }
      }
    }
    return false;
  }
}
